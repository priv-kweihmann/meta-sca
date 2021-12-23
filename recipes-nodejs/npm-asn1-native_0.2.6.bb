SUMMARY = "NPM: asn1"
DESCRIPTION = "Contains parsers and serializers for ASN.1 (currently BER only)"
HOMEPAGE = "https://github.com/joyent/node-asn1#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ce2f42143c298495637e28e40cd5462"

DEPENDS = "npm-safer-buffer-native"

SRC_URI = "https://registry.npmjs.org/asn1/-/asn1-0.2.6.tgz"
SRC_URI[md5sum] = "245ff132f1b443e9ae0135a939139985"
SRC_URI[sha256sum] = "17ca6fff19e3f681ae310bda39262b9968b57bee3771a730818772d83a8fe250"

NPM_PKGNAME = "asn1"

inherit npmhelper
inherit native
