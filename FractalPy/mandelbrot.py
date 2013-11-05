from numpy import*
import pylab
#TODO: add more documentation, and more convergence test. Improve preformence.
'''Function that will generate a fractal in C for a given complex function and grid size.
# maxit determines number of iterations the script will perform.'''

def Mandelbrot(h,w,maxit=12):
	y,x=ogrid[2.5:-2.5:h*1j,-2.5:2.5:w*1j]
	c=x+y*1j
	z=c
	#c=-.25-2j
	divtime = maxit + zeros(z.shape,dtype=int) 
	for i in xrange(maxit):
		z=z**2+c
		diverge=diverge2(z,i)
		diverge_now = diverge & (divtime==maxit)
		divtime[diverge_now]=i
		z[diverge]=2
	return divtime

#four convergence test that will reveal different features in the plane
def diverge1(z,i):
	return sqrt(real(z)**2+imag(z)**2)>2**2

def diverge2(z,i):
	return (abs(real(z))>50) & (abs(imag(z))>50)

def diverge3(z,i):
	return ((real(z)**2+imag(z)**2)>2**2) & (i%2==0)

def diverge_bug(z,i):
	return logical_or(abs(real(z))>50,abs(imag(z))>50)

pylab.imshow(Mandelbrot(600,600))
pylab.show()
