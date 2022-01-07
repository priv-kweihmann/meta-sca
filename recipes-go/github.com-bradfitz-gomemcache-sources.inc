SRC_URI += "https://proxy.golang.org/github.com/bradfitz/gomemcache/@v/v0.0.0-20220106215444-fb4bf637b56d.zip;srcoutput=github.com/bradfitz/gomemcache;srcinput=github.com/bradfitz/gomemcache@v0.0.0-20220106215444-fb4bf637b56d;downloadfilename=github-com-bradfitz-gomemcache-0.0.0-20220106215444-fb4bf637b56d.zip;name=github-com-bradfitz-gomemcache"
SRC_URI[github-com-bradfitz-gomemcache.sha256sum] = "cb329cbfa8420f0746c2b598931f6e20ca85a194adea8977c95b33f3f9fa321f"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/bradfitz/gomemcache/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-bradfitz-gomemcache-sources.inc"

