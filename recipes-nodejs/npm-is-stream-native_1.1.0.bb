SUMMARY = "NPM: is-stream"
DESCRIPTION = "Check if something is a Node.js stream"
HOMEPAGE = "https://github.com/sindresorhus/is-stream#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/is-stream/-/is-stream-1.1.0.tgz"
SRC_URI[md5sum] = "b4f9e36708f66ba3a1ffeced6dbf6a84"
SRC_URI[sha256sum] = "9dd833c75e16693641970a1c2c0aa6dd5f5da392424e23494ed9ba20311c381f"

NPM_PKGNAME = "is-stream"

inherit npmhelper
inherit native
