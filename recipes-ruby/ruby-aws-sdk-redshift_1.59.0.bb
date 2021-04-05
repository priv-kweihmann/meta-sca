SUMMARY = "RubyGem: aws-sdk-redshift"
DESCRIPTION = "Official AWS Ruby gem for Amazon Redshift"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a8d1d9a256c13eed72e86323962f03de"
SRC_URI[sha256sum] = "3c14da2096211f2277b245bfbe91ddbdeaadc8d89c64cb6b1f989aa931753d39"

GEM_NAME = "aws-sdk-redshift"

inherit rubygems
