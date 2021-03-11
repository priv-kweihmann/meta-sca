SUMMARY = "RubyGem: aws-sdk-transfer"
DESCRIPTION = "Official AWS Ruby gem for AWS Transfer Family (AWS Transfer)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "feb4035d8f5386b999acf1f7ed79b877"
SRC_URI[sha256sum] = "83c6a5f1524443de8ab14db87126efbf85f535f76111dad59d44bd02214ffd44"

GEM_NAME = "aws-sdk-transfer"

inherit rubygems
