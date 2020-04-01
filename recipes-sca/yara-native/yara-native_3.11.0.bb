SUMMARY = "The pattern matching swiss knife"
HOMEPAGE = "https://github.com/VirusTotal/yara"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=541962f9dacf27c928f57e3a7ba9e1f2"

DEPENDS += "bison-native"

SRC_URI = "git://github.com/VirusTotal/yara.git;protocol=https;tag=v${PV} \
           file://yara.sca.description"

# This patch fixes a build issue in 3.11 which is already upstreamed but not available in tagged release
SRC_URI += "https://github.com/VirusTotal/yara/commit/04df811fa61fa54390b274bfcf56d7403c184404.patch;name=patch"
SRC_URI[patch.md5sum] = "8d390c86878f983e7ab79b03f5bef696"
SRC_URI[patch.sha256sum] = "f112d8aca20a27b6c18adcc200e12ed02424a37fe4ae36d71d8611963ddc9f8f"

S = "${WORKDIR}/git"

inherit autotools-brokensep
inherit native
inherit sca-sanity

do_install_append () {
    install -d ${D}/${datadir}
    install ${WORKDIR}/yara.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
