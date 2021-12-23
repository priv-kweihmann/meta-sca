SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d4be4fba9b7d7c16379d54e87d199f1"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "046d14dde6e3568aee5085487dd4769e"
SRC_URI[sha256sum] = "66a1164981d449da46cc88383fe37f9e352e87e9570bfb960e43fe8ff016ee1b"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
