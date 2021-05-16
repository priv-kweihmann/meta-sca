SUMMARY = "NPM: pkg-up"
DESCRIPTION = "Find the closest package.json file"
HOMEPAGE = "https://github.com/sindresorhus/pkg-up#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

DEPENDS = "npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/pkg-up/-/pkg-up-2.0.0.tgz"
SRC_URI[md5sum] = "5849bcb5a9dfb0c277f15163b59fe383"
SRC_URI[sha256sum] = "54df4f84139d252e7c36724329cf6414c4f9508e81156fe68c90bb2c4373d3cd"

NPM_PKGNAME = "pkg-up"

inherit npmhelper
inherit native
