SUMMARY = "YAML support for the Go language"
HOMEPAGE = "https://github.com/go-yaml/yaml"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3c91c17266710e16afdbb2b6d15c761c"

DEPENDS += "github.com-go-check-check-native"

SRC_URI = "git://github.com/go-yaml/yaml;protocol=https;branch=v3"
SRCREV = "2ff61e1afc866138abf1a8adf3cc89721090ac31"

## This is a alias-recipe
GO_IMPORT = "gopkg.in/yaml.v3"

inherit go
inherit native
