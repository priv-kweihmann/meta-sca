SRC_URI += "https://proxy.golang.org/github.com/nightlyone/lockfile/@v/v1.0.0.zip;srcoutput=github.com/nightlyone/lockfile;srcinput=github.com/nightlyone/lockfile@v1.0.0;downloadfilename=github-com-nightlyone-lockfile-1.0.0.zip;name=github-com-nightlyone-lockfile"
SRC_URI[github-com-nightlyone-lockfile.sha256sum] = "0abd22d55b704c18426167732414806b2a70d99bce65fa9f943cb88c185689ad"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/nightlyone/lockfile/LICENSE;md5=482ccf3e8aad8eecce130ae0eb49f2e4 \
"

GOSRC_INCLUDEGUARD += "github.com-nightlyone-lockfile-sources.inc"

