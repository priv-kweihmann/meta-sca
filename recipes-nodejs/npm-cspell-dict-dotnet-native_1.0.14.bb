SUMMARY = "NPM: cspell-dict-dotnet"
DESCRIPTION = ".Net dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/dotnet#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-dotnet/-/cspell-dict-dotnet-1.0.14.tgz"
SRC_URI[md5sum] = "7e9c1c0033800ac14f8890d72a5ce5a4"
SRC_URI[sha256sum] = "75ca146b9d636ce6fa0d32c34584fcd0e4c9237a26aa4cf583e080ce383e80dc"

NPM_PKGNAME = "cspell-dict-dotnet"

inherit npmhelper
inherit native
