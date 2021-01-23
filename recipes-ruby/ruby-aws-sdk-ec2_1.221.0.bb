SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "fc4585aadd7a5f712f2948acbfd5be66"
SRC_URI[sha256sum] = "237e7e00bfd73853048a3db4a5e1f951e032172f16cf62e74a7f2a5b1f4a8d57"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
