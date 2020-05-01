SUMMARY = "Alex Kohler static go analyzer"
HOMEPAGE = "https://github.com/alexkohler"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
                    file://src/${GO_IMPORT}/dogsled/LICENSE;md5=55bfb4256a903d5c2d6be3e909894bef \
                    file://src/${GO_IMPORT}/identypo/LICENSE;md5=55bfb4256a903d5c2d6be3e909894bef \
                    file://src/${GO_IMPORT}/nakedret/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995 \
                    file://src/${GO_IMPORT}/nargs/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995 \
                    file://src/${GO_IMPORT}/noret/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995 \
                    file://src/${GO_IMPORT}/prealloc/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995 \
                    file://src/${GO_IMPORT}/unimport/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995 \
                   "

DEPENDS += "golang.org-x-tools-native"

PROVIDES += "github.com-alexkohler-dogsled-native"
PROVIDES += "github.com-alexkohler-identypo-native"
PROVIDES += "github.com-alexkohler-nakedret-native"
PROVIDES += "github.com-alexkohler-nargs-native"
PROVIDES += "github.com-alexkohler-noret-native"
PROVIDES += "github.com-alexkohler-prealloc-native"
PROVIDES += "github.com-alexkohler-unimport-native"

SRC_URI = "\
           file://alexkohler.sca.description \
           git://github.com/alexkohler/noret.git;protocol=https;name=noret;destsuffix=git/src/github.com/alexkohler/noret \
           git://github.com/alexkohler/nargs.git;protocol=https;name=nargs;destsuffix=git/src/github.com/alexkohler/nargs \
           git://github.com/alexkohler/nakedret.git;protocol=https;name=nakedret;destsuffix=git/src/github.com/alexkohler/nakedret \
           git://github.com/alexkohler/dogsled.git;protocol=https;name=dogsled;destsuffix=git/src/github.com/alexkohler/dogsled \
           git://github.com/alexkohler/prealloc.git;protocol=https;name=prealloc;destsuffix=git/src/github.com/alexkohler/prealloc \
           git://github.com/alexkohler/identypo.git;protocol=https;name=identypo;destsuffix=git/src/github.com/alexkohler/identypo \
           git://github.com/alexkohler/unimport.git;protocol=https;name=unimport;destsuffix=git/src/github.com/alexkohler/unimport \
          "

SRCREV_noret = "57c4d447ca7ab711a3b2aaf28d1d9f8dbe34fab6"
SRCREV_nargs = "5ef696e27c16538fd893c3724418b782bbf58b7b"
SRCREV_nakedret = "98ae56e4e0f34d004581c2337fd7906045cc81bb"
SRCREV_dogsled = "dad318941ed237414e932c0bd27a2431aa85fcce"
SRCREV_prealloc = "4fce4887dad9de1bfcb1198774138a30c193f778"
SRCREV_identypo = "dcb8a79840450edb48a29a1621321101510b338e"
SRCREV_unimport = "e6f2b2e2d406ad19518ce48d88278589d86b193d"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/alexkohler"

inherit go
inherit native
inherit sca-sanity
inherit sca-description

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/alexkohler.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
