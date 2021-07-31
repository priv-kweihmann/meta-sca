SRC_URI += "https://proxy.golang.org/github.com/alexkohler/dogsled/@v/v0.0.0-20210716154023-34d2ab9edb3d.zip;srcoutput=github.com/alexkohler/dogsled;srcinput=github.com/alexkohler/dogsled@v0.0.0-20210716154023-34d2ab9edb3d;downloadfilename=github-com-alexkohler-dogsled-0.0.0-20210716154023-34d2ab9edb3d.zip;name=github-com-alexkohler-dogsled"
SRC_URI[github-com-alexkohler-dogsled.sha256sum] = "01523db2e7d5f34364dbccc47842f9532a0307e8a8b17c2483b65c927e34fae1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/alexkohler/dogsled/LICENSE;md5=55bfb4256a903d5c2d6be3e909894bef \
"

GOSRC_INCLUDEGUARD += "github.com-alexkohler-dogsled-sources.inc"

