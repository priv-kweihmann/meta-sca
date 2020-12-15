SUMMARY = "RubyGem: train-winrm"
DESCRIPTION = "Allows applictaions using Train to speak to Windows using Remote Management; handles authentication, cacheing, and SDK dependency management."
HOMEPAGE = "https://github.com/inspec/train-winrm"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-winrm \
                  ruby-winrm-elevated \
                  ruby-winrm-fs"

SRC_URI[md5sum] = "d13c9332434c16820e2c48e1b68573b8"
SRC_URI[sha256sum] = "3c6dc9ed843df2f1a16c1bbb1f74be0bc9edd9d3006223c9de0a37992c7d9530"

GEM_NAME = "train-winrm"

inherit rubygems
