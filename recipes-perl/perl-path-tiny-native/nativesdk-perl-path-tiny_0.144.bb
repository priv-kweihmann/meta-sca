SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d4be4fba9b7d7c16379d54e87d199f1"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "7b2fc4f5edfd29b88d2cc3b96830e7d1"
SRC_URI[sha256sum] = "f6ea094ece845c952a02c2789332579354de8d410a707f9b7045bd241206487d"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan
inherit nativesdk
