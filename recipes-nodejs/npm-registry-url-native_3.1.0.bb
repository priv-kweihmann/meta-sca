SUMMARY = "NPM: registry-url"
DESCRIPTION = "Get the set npm registry URL"
HOMEPAGE = "https://github.com/sindresorhus/registry-url"

DEPENDS = "npm-rc-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/registry-url/-/registry-url-3.1.0.tgz"
SRC_URI[md5sum] = "5696ee5675aab7f825ec724e4cca8ed3"
SRC_URI[sha256sum] = "6eda4369ded595f02eadc22c9d229e0d77289b406385373073df21c6c2c10a9a"

NPM_PKGNAME = "registry-url"

inherit npmhelper
inherit native
