SUMMARY = "NPM: latest-version"
DESCRIPTION = "Get the latest version of an npm package"
HOMEPAGE = "https://github.com/sindresorhus/latest-version#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-package-json-native"

SRC_URI = "https://registry.npmjs.org/latest-version/-/latest-version-6.0.0.tgz"
SRC_URI[md5sum] = "128f36af837da26c2d8a971e8ade5a4a"
SRC_URI[sha256sum] = "23b8c2721d9df3884a2e35ff8eb8f98a6cbe137a0a8645bac2467abdbd3b9228"

NPM_PKGNAME = "latest-version"

inherit npmhelper
inherit native
