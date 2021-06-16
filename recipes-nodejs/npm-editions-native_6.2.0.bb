SUMMARY = "NPM: editions"
DESCRIPTION = "Publish multiple editions for your JavaScript packages consistently and easily (e.g. source edition, esnext edition, es2015 edition)"
HOMEPAGE = "https://github.com/bevry/editions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=62a99672615fb0faaabd018b4f05c3d1"

DEPENDS = "npm-errlop-native \
           npm-version-range-native"

SRC_URI = "https://registry.npmjs.org/editions/-/editions-6.2.0.tgz"
SRC_URI[md5sum] = "f41a047b395eb7cb1723f40ad9319420"
SRC_URI[sha256sum] = "92dd314388674e69a5576b4a184abda605bd0843b897187eccbbc26a5e58c425"

NPM_PKGNAME = "editions"

inherit npmhelper
inherit native
