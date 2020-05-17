SUMMARY = "NPM: asn1"
DESCRIPTION = "Contains parsers and serializers for ASN.1 (currently BER only)"
HOMEPAGE = "https://github.com/joyent/node-asn1#readme"

DEPENDS = "npm-safer-buffer-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ce2f42143c298495637e28e40cd5462"

SRC_URI = "https://registry.npmjs.org/asn1/-/asn1-0.2.4.tgz"
SRC_URI[md5sum] = "e52df5062c44aa0c650c9128e3b5e1ee"
SRC_URI[sha256sum] = "e1a444974c38e516e8a0cd7a87b62d5fa6df78d41a02f5fc246f9e566793d53b"

S = "${WORKDIR}/package"

NPM_PKGNAME = "asn1"

inherit npmhelper
inherit native
