SRC_URI += "https://proxy.golang.org/github.com/bradfitz/gomemcache/@v/v0.0.0-20190913173617-a41fca850d0b.zip;srcoutput=github.com/bradfitz/gomemcache;srcinput=github.com/bradfitz/gomemcache@v0.0.0-20190913173617-a41fca850d0b;downloadfilename=github-com-bradfitz-gomemcache-0.0.0-20190913173617-a41fca850d0b.zip;name=github-com-bradfitz-gomemcache"
SRC_URI[github-com-bradfitz-gomemcache.sha256sum] = "eb71acfac0c4ce5f0b6537d8029de98902d83fd38fdcbfd757f06697c6323f78"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/bradfitz/gomemcache/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-bradfitz-gomemcache-sources.inc"

