SUMMARY = "YAML 1.2 processor"
HOMEPAGE = "https://metacpan.org/pod/YAML::PP"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ed15294933f5d94828e02d243070d415"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/YAML-PP-v${PV}.tar.gz"

SRC_URI[sha256sum] = "cf5f1096af3ea5c036d838847b213a613e9a85b757962bacf508d4ad72f88f49"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/YAML-PP-v${PV}"

inherit cpan
inherit_defer native

UPSTREAM_CHECK_REGEX = "YAML-PP-v(?P<pver>\d+.\d+(.\d+)*).tar.gz"
