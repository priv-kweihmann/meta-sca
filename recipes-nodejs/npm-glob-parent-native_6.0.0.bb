SUMMARY = "NPM: glob-parent"
DESCRIPTION = "Extract the non-magic parent path from a glob string."
HOMEPAGE = "https://github.com/gulpjs/glob-parent#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=741e38024be3bd65f6d836f460f4445f"

DEPENDS = "npm-is-glob-native"

SRC_URI = "https://registry.npmjs.org/glob-parent/-/glob-parent-6.0.0.tgz"
SRC_URI[md5sum] = "3e79868409cc6d2df618b0d65428d521"
SRC_URI[sha256sum] = "e8a72d8a380cd3531befb73cef2767481781ceda29bfdf269bf239e2578b8c28"

NPM_PKGNAME = "glob-parent"

inherit npmhelper
inherit native
