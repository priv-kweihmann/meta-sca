SRC_URI += "https://proxy.golang.org/github.com/cpuguy83/go-md2man/v2/@v/v2.0.7.zip;srcoutput=github.com/cpuguy83/go-md2man/v2;srcinput=github.com/cpuguy83/go-md2man/v2@v2.0.7;downloadfilename=github-com-cpuguy83-go-md2man-v2-2.0.7.zip;name=github-com-cpuguy83-go-md2man-v2"
SRC_URI[github-com-cpuguy83-go-md2man-v2.sha256sum] = "9ad5f2cbc644c0bb648a9b182d6b70f92e7ac4dfab5cf0ef746bbeef944fda59"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/cpuguy83/go-md2man/v2/LICENSE.md;md5=80794f9009df723bbc6fe19234c9f517 \
"

GOSRC_INCLUDEGUARD += "github.com-cpuguy83-go-md2man-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-russross-blackfriday-v2-sources.inc', '', 'github.com-russross-blackfriday-v2-sources.inc', d)}
