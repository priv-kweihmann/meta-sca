SUMMARY = "NPM: import-lazy"
DESCRIPTION = "Import a module lazily"
HOMEPAGE = "https://github.com/sindresorhus/import-lazy#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/import-lazy/-/import-lazy-4.0.0.tgz"
SRC_URI[md5sum] = "7e31a48d4e64aadfac6523af936c209c"
SRC_URI[sha256sum] = "0b1a568d6c01ddb9f75712522294655a0d104506a573988285edcfc7fedda919"

NPM_PKGNAME = "import-lazy"

inherit npmhelper
inherit native
