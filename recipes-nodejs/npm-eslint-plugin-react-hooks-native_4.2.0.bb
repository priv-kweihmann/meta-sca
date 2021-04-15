SUMMARY = "NPM: eslint-plugin-react-hooks"
DESCRIPTION = "ESLint rules for React Hooks"
HOMEPAGE = "https://reactjs.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react-hooks/-/eslint-plugin-react-hooks-4.2.0.tgz"
SRC_URI[md5sum] = "0cac8d5cc115308a289167d41d276ea5"
SRC_URI[sha256sum] = "72afb04f2988292f8741c3f4d38ab4805f809d4fb603aa9a34d6ca3a51afa78d"

NPM_PKGNAME = "eslint-plugin-react-hooks"

inherit npmhelper
inherit native
