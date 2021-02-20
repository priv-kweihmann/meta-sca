SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d8f4d0dffd229a5cc9b2af127d8a6039"
SRC_URI[sha256sum] = "8d348338e7e5e3ab88aed0e274543602e3eb81c171d277f84c4f9d8bae1c4ef4"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
