SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d4be4fba9b7d7c16379d54e87d199f1"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "b6a3eae2cea1fa4336f6c8fcff946636"
SRC_URI[sha256sum] = "818aed754b74f399e42c238bea738e20a52af89a6e3feb58bec9d0130eea4746"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Path-Tiny-${PV}"

inherit cpan
inherit_defer nativesdk
