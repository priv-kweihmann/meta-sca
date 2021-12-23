SUMMARY = "NPM: path-to-glob-pattern"
DESCRIPTION = "Convert file/directory path to glob pattern."
HOMEPAGE = "https://github.com/azu/path-to-glob-pattern"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dd32d26fede367f46c5860fa598897c"

SRC_URI = "https://registry.npmjs.org/path-to-glob-pattern/-/path-to-glob-pattern-1.0.2.tgz"
SRC_URI[md5sum] = "65404b6f2b98b95698a6e4be2fa3f505"
SRC_URI[sha256sum] = "561fa48c9721bf15f8211cb56b81a54a11fe2539f3be9dd48645787a7ac7d0fb"

NPM_PKGNAME = "path-to-glob-pattern"

inherit npmhelper
inherit native
