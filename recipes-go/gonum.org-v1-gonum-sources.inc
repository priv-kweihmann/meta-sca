SRC_URI += "https://proxy.golang.org/gonum.org/v1/gonum/@v/v0.9.1.zip;srcoutput=gonum.org/v1/gonum;srcinput=gonum.org/v1/gonum@v0.9.1;downloadfilename=gonum-org-v1-gonum-0.9.1.zip;name=gonum-org-v1-gonum"
SRC_URI[gonum-org-v1-gonum.sha256sum] = "ad30f0b630c9eb51e07e436f1fd7251cdf23adb541237912237f440291e5110c"

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
