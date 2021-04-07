SRC_URI += "https://proxy.golang.org/github.com/go-toolsmith/pkgload/@v/v1.0.1.zip;srcoutput=github.com/go-toolsmith/pkgload;srcinput=github.com/go-toolsmith/pkgload@v1.0.1;downloadfilename=github-com-go-toolsmith-pkgload-1.0.1.zip;name=github-com-go-toolsmith-pkgload"
SRC_URI[github-com-go-toolsmith-pkgload.sha256sum] = "8a33cdaf29fde63298d2a18daaa5575b0b54c698a94f95b0bb3c84eadba124a5"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-toolsmith/pkgload/LICENSE;md5=00118c0f9ef68d6f8476f68e837f8174 \
"

GOSRC_INCLUDEGUARD += "github.com-go-toolsmith-pkgload-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
