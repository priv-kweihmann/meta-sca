SUMMARY = "NPM: editions"
DESCRIPTION = "Publish multiple editions for your JavaScript packages consistently and easily (e.g. source edition, esnext edition, es2015 edition)"
HOMEPAGE = "https://github.com/bevry/editions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=62a99672615fb0faaabd018b4f05c3d1"

DEPENDS = "npm-version-range-native"

SRC_URI = "https://registry.npmjs.org/editions/-/editions-6.7.0.tgz"
SRC_URI[md5sum] = "35dfc7338f2e2ee887295eba645cdbd7"
SRC_URI[sha256sum] = "b343b0d15d663ca3dbf4840d54cfdebc14028ad884469724321b9633dd3ff9f7"

NPM_PKGNAME = "editions"

inherit npmhelper
inherit native
