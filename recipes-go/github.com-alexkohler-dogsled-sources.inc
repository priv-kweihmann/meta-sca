SRC_URI += "https://proxy.golang.org/github.com/alexkohler/dogsled/@v/v0.0.0-20181108112831-dad318941ed2.zip;srcoutput=github.com/alexkohler/dogsled;srcinput=github.com/alexkohler/dogsled@v0.0.0-20181108112831-dad318941ed2;downloadfilename=github-com-alexkohler-dogsled-0.0.0-20181108112831-dad318941ed2.zip;name=github-com-alexkohler-dogsled"
SRC_URI[github-com-alexkohler-dogsled.sha256sum] = "d2b1c95b0c6a22e27ce47316a017aea6f20fa82b4f4caecec67f8e77cd35293e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/alexkohler/dogsled/LICENSE;md5=55bfb4256a903d5c2d6be3e909894bef \
"

GOSRC_INCLUDEGUARD += "github.com-alexkohler-dogsled-sources.inc"

