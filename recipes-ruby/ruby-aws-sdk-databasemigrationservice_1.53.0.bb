SUMMARY = "RubyGem: aws-sdk-databasemigrationservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Database Migration Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "1ce2f08c33bd63b75196909a2c4b2533"
SRC_URI[sha256sum] = "865414c83054e4026548edb55adc8b6b9ae1abd70320173c5f7519d1565df74e"

GEM_NAME = "aws-sdk-databasemigrationservice"

inherit rubygems
