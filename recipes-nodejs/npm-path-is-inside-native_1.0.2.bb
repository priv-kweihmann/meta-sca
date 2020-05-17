SUMMARY = "NPM: path-is-inside"
DESCRIPTION = "Tests whether one path is inside another path"
HOMEPAGE = "https://github.com/domenic/path-is-inside#readme"

LICENSE = "WTFPL | MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8de5f23be471b6814f19b2ad82a5208a"

SRC_URI = "https://registry.npmjs.org/path-is-inside/-/path-is-inside-1.0.2.tgz"
SRC_URI[md5sum] = "8f27701be0f4d4da9534227663ae61ed"
SRC_URI[sha256sum] = "88ef3e87ca1c89673a00c9a1ef3a2b0ebd7248f9911d2183527fcf7215a24d9d"

NPM_PKGNAME = "path-is-inside"

inherit npmhelper
inherit native
