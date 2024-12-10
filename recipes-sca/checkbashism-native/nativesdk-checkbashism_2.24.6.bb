SUMMARY = "check for bashisms in /bin/sh scripts"
HOMEPAGE = "https://salsa.debian.org/debian/devscripts"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=faa39cbd7a7cded9a1436248295de3c2"

DEPENDS += "nativesdk-perl"

SRC_URI:append = " \
    http://deb.debian.org/debian/pool/main/d/devscripts/devscripts_${PV}.tar.xz \
    file://checkbashism.sca.description \
"

SRC_URI[sha256sum] = "0389da28aa6c55122ff1c3aaa1162ecb77488a7f76ecde91296d03a4a2f51d6e"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/devscripts"
UPSTREAM_CHECK_REGEX = "devscripts_(?P<pver>\d+\.\d+\.\d+)"

inherit sca-description
inherit_defer nativesdk
do_configure[noexec] = "1"
do_compile[noexec] = "1"
SCA_TOOL_DESCRIPTION = "checkbashism"
do_install() {
    install -d ${D}${bindir}

    install -m 0755 ${S}/scripts/checkbashisms.bash_completion ${D}${bindir}
    install -m 0755 ${S}/scripts/checkbashisms.pl ${D}${bindir}
    # enforce usage of sysroot perl instead of host sided
    sed -i "s|/usr/bin/perl|/usr/bin/env perl|g" ${D}${bindir}/checkbashisms.pl
}
FILES:${PN} += "${bindir}"
RDEPENDS:${PN}:class-nativesdk += "nativesdk-perl"
