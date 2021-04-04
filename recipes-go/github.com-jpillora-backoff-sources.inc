SRC_URI += "https://proxy.golang.org/github.com/jpillora/backoff/@v/v1.0.0.zip;srcoutput=github.com/jpillora/backoff;srcinput=github.com/jpillora/backoff@v1.0.0;downloadfilename=github-com-jpillora-backoff-1.0.0.zip;name=github-com-jpillora-backoff"
SRC_URI[github-com-jpillora-backoff.sha256sum] = "f856692c725143c49b9cceabfbca8bc93d3dbde84a0aaa53fb26ed3774c220cc"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jpillora/backoff/LICENSE;md5=642049c2ea167da3ea933b5eb0661e10 \
"

GOSRC_INCLUDEGUARD += "github.com-jpillora-backoff-sources.inc"

