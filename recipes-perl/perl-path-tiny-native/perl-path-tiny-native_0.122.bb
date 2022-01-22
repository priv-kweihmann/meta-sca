SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d4be4fba9b7d7c16379d54e87d199f1"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "f746d8da5d049a5523b1880666bb0992"
SRC_URI[sha256sum] = "4bc6f76d0548ccd8b38cb66291a885bf0de453d0167562c7b82e8861afdcfb7c"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
