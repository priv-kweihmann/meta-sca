SRC_URI += "https://proxy.golang.org/github.com/rs/xid/@v/v1.4.0.zip;srcoutput=github.com/rs/xid;srcinput=github.com/rs/xid@v1.4.0;downloadfilename=github-com-rs-xid-1.4.0.zip;name=github-com-rs-xid"
SRC_URI[github-com-rs-xid.sha256sum] = "94bbc83a933838e64cf00d4abc1942236a82cb21d4b5142c4f0fedb578288871"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rs/xid/LICENSE;md5=785017b3cd2e2cd7d8fdd30f36d67a93 \
"

GOSRC_INCLUDEGUARD += "github.com-rs-xid-sources.inc"

