SRC_URI += "https://proxy.golang.org/gonum.org/v1/gonum/@v/v0.13.0.zip;srcoutput=gonum.org/v1/gonum;srcinput=gonum.org/v1/gonum@v0.13.0;downloadfilename=gonum-org-v1-gonum-0.13.0.zip;name=gonum-org-v1-gonum"
SRC_URI[gonum-org-v1-gonum.sha256sum] = "adcc3c5aa21189388e5e3100add520a34d35f9d0db180eb229949a2359c97124"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    BSL-1.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/gonum.org/v1/gonum/LICENSE;md5=fabff3dab4b5a6c3e29611c973dc3df9 \
    file://src/gonum.org/v1/gonum/THIRD_PARTY_LICENSES/Boost-LICENSE;md5=e4224ccaecb14d942c71d31bef20d78c \
    file://src/gonum.org/v1/gonum/THIRD_PARTY_LICENSES/Cephes-LICENSE;md5=d7692626769f3a619d05aa5ede778ff8 \
    file://src/gonum.org/v1/gonum/THIRD_PARTY_LICENSES/Fike-LICENSE;md5=5c8f27a76bad84045c28eac54fc5e7f6 \
    file://src/gonum.org/v1/gonum/THIRD_PARTY_LICENSES/Go-LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
    file://src/gonum.org/v1/gonum/THIRD_PARTY_LICENSES/MT19937-64-LICENSE;md5=cd58ab7bdcbdf6192101f07273b819b0 \
    file://src/gonum.org/v1/gonum/THIRD_PARTY_LICENSES/MT19937-LICENSE;md5=07daced906cca42116429b5b64b3451f \
    file://src/gonum.org/v1/gonum/THIRD_PARTY_LICENSES/Oxford-LICENSE;md5=f0878a9b1fb632d57b464590fb4e7377 \
    file://src/gonum.org/v1/gonum/THIRD_PARTY_LICENSES/Probab-LICENSE;md5=87bf722497ab4f2731cbc1909a3c09d9 \
    file://src/gonum.org/v1/gonum/THIRD_PARTY_LICENSES/W3C-BSD-LICENSE;md5=4d7dcb238834c00676843e40dc69a99a \
"

GOSRC_INCLUDEGUARD += "gonum.org-v1-gonum-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-exp-sources.inc', '', 'golang.org-x-exp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gonum.org-v1-plot-sources.inc', '', 'gonum.org-v1-plot-sources.inc', d)}
