SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d4be4fba9b7d7c16379d54e87d199f1"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "a7f8c029d11b344f38601855f872851c"
SRC_URI[sha256sum] = "74109aec04ddd83d80ee14a5346e8bc3e3f4673238e1c7358693bff348196c13"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan
inherit nativesdk
