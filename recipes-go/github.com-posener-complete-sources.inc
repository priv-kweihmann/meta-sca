SRC_URI += "https://proxy.golang.org/github.com/posener/complete/@v/v1.2.3.zip;srcoutput=github.com/posener/complete;srcinput=github.com/posener/complete@v1.2.3;downloadfilename=github-com-posener-complete-1.2.3.zip;name=github-com-posener-complete"
SRC_URI[github-com-posener-complete.sha256sum] = "88b48005b995dc6592fa6fda08130488c83f63bcaa4ccb0fb8e926fee63112ec"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/posener/complete/LICENSE.txt;md5=6778be8533804ed9e25f746e2f0ba0ee \
"

GOSRC_INCLUDEGUARD += "github.com-posener-complete-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-multierror-sources.inc', '', 'github.com-hashicorp-go-multierror-sources.inc', d)}
