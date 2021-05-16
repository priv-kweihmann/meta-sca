SUMMARY = "NPM: editions"
DESCRIPTION = "Publish multiple editions for your JavaScript packages consistently and easily (e.g. source edition, esnext edition, es2015 edition)"
HOMEPAGE = "https://github.com/bevry/editions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=1c9db38d8b92d7b0f3565a5a7fe66587"

DEPENDS = "npm-errlop-native \
           npm-version-range-native"

SRC_URI = "https://registry.npmjs.org/editions/-/editions-6.1.0.tgz"
SRC_URI[md5sum] = "ff68c4678befeff57a59bcd3b48e70f2"
SRC_URI[sha256sum] = "86620984470757e92f129dafc536cec6f459c48b3bafe62ce4ff20fac6a2190a"

NPM_PKGNAME = "editions"

inherit npmhelper
inherit native
