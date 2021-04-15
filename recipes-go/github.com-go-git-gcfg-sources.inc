SRC_URI += "https://proxy.golang.org/github.com/go-git/gcfg/@v/v1.5.0.zip;srcoutput=github.com/go-git/gcfg;srcinput=github.com/go-git/gcfg@v1.5.0;downloadfilename=github-com-go-git-gcfg-1.5.0.zip;name=github-com-go-git-gcfg"
SRC_URI[github-com-go-git-gcfg.sha256sum] = "26feb61ab410279acad464228f9cd3e35022738b91375eae1e93f13d15037bd6"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-git/gcfg/LICENSE;md5=13cea479df204c85485b5db6eb1bc9d5 \
"

GOSRC_INCLUDEGUARD += "github.com-go-git-gcfg-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-warnings.v0-sources.inc', '', 'gopkg.in-warnings.v0-sources.inc', d)}
