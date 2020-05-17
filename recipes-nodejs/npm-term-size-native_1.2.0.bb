SUMMARY = "NPM: term-size"
DESCRIPTION = "Reliably get the terminal window size (columns & rows)"
HOMEPAGE = "https://github.com/sindresorhus/term-size#readme"

DEPENDS = "npm-execa-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/term-size/-/term-size-1.2.0.tgz"
SRC_URI[md5sum] = "3c6ba6f50174805f2ce6a32cef0f42d3"
SRC_URI[sha256sum] = "98552c53c7dbedd07ea56f244c676b93f5f8a7558bac4dbb011eeb9383f58d4f"

NPM_PKGNAME = "term-size"

inherit npmhelper
inherit native
