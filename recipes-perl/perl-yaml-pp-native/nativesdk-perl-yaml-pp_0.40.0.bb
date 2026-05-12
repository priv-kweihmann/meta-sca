SUMMARY = "YAML 1.2 processor"
HOMEPAGE = "https://metacpan.org/pod/YAML::PP"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1af3dd18939834f88fae5b9a0dfd5ccc"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/YAML-PP-v${PV}.tar.gz"

SRC_URI[sha256sum] = "76c4d28d5c78f0a5cfec631f0032aff1baa68a705f21f6f4bfe70ad83dce2e33"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/YAML-PP-v${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer nativesdk

UPSTREAM_CHECK_REGEX = "YAML-PP-v(?P<pver>\d+.\d+(.\d+)*).tar.gz"
