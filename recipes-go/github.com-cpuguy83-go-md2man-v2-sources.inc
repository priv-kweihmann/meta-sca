SRC_URI += "https://proxy.golang.org/github.com/cpuguy83/go-md2man/v2/@v/v2.0.1.zip;srcoutput=github.com/cpuguy83/go-md2man/v2;srcinput=github.com/cpuguy83/go-md2man/v2@v2.0.1;downloadfilename=github-com-cpuguy83-go-md2man-v2-2.0.1.zip;name=github-com-cpuguy83-go-md2man-v2"
SRC_URI[github-com-cpuguy83-go-md2man-v2.sha256sum] = "f5ded1130031e98dc4bdf17e45ac89ad2eeae3083d6150b6d5f3fc75b9e9cd6b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cpuguy83/go-md2man/v2/LICENSE.md;md5=80794f9009df723bbc6fe19234c9f517 \
"

GOSRC_INCLUDEGUARD += "github.com-cpuguy83-go-md2man-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-russross-blackfriday-v2-sources.inc', '', 'github.com-russross-blackfriday-v2-sources.inc', d)}
