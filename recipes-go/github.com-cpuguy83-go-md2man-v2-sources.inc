SRC_URI += "https://proxy.golang.org/github.com/cpuguy83/go-md2man/v2/@v/v2.0.6.zip;srcoutput=github.com/cpuguy83/go-md2man/v2;srcinput=github.com/cpuguy83/go-md2man/v2@v2.0.6;downloadfilename=github-com-cpuguy83-go-md2man-v2-2.0.6.zip;name=github-com-cpuguy83-go-md2man-v2"
SRC_URI[github-com-cpuguy83-go-md2man-v2.sha256sum] = "b8059316e38bcfd28b69d2c2b32d34b9e800ccaa1ff4b5a61022cbe98fa7c710"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/cpuguy83/go-md2man/v2/LICENSE.md;md5=80794f9009df723bbc6fe19234c9f517 \
"

GOSRC_INCLUDEGUARD += "github.com-cpuguy83-go-md2man-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-russross-blackfriday-v2-sources.inc', '', 'github.com-russross-blackfriday-v2-sources.inc', d)}
