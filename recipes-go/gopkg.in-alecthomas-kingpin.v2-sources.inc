SRC_URI_append = " https://proxy.golang.org/gopkg.in/alecthomas/kingpin.v2/@v/v2.2.6.zip;srcoutput=gopkg.in/alecthomas/kingpin.v2;srcinput=gopkg.in/alecthomas/kingpin.v2@v2.2.6;downloadfilename=gopkg-in-alecthomas-kingpin-v2-2.2.6.zip;name=gopkg-in-alecthomas-kingpin-v2"
SRC_URI[gopkg-in-alecthomas-kingpin-v2.sha256sum] = "638080591aefe7d2642f2575b627d534c692606f02ea54ba89f42db112ba8839"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/gopkg.in/alecthomas/kingpin.v2/COPYING;md5=c5ef1b09608767a6284a2cffd3b9765f \
"
