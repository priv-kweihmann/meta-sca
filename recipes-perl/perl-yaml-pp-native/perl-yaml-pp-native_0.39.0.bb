SUMMARY = "YAML 1.2 processor"
HOMEPAGE = "https://metacpan.org/pod/YAML::PP"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b08b1c2487287598b44d28b6e83dd16"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/YAML-PP-v${PV}.tar.gz"

SRC_URI[sha256sum] = "32f53c65781277dcbe50827b4cbf217eceeff264779e3a6c98c94229eb149f58"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/YAML-PP-v${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native

UPSTREAM_CHECK_REGEX = "YAML-PP-v(?P<pver>\d+.\d+(.\d+)*).tar.gz"
