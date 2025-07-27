SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d4be4fba9b7d7c16379d54e87d199f1"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "7126ad3d5c14a32a5f4bde0054f57449"
SRC_URI[sha256sum] = "ff20713d1a14d257af9c78209001f40dc177e4b9d1496115cbd8726d577946c7"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Path-Tiny-${PV}"

inherit cpan
inherit_defer native
