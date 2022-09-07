SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d4be4fba9b7d7c16379d54e87d199f1"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "16dd03cded30d00167a03315d0e11e51"
SRC_URI[sha256sum] = "fa083144781e46817ec39d21962bbbb0533c201f3baf031d2999a785a2a013fd"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan
inherit native
