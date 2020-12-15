SUMMARY = "RubyGem: aws-sdk-guardduty"
DESCRIPTION = "Official AWS Ruby gem for Amazon GuardDuty"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "5f2ad6692ba444af99c3b35658795e54"
SRC_URI[sha256sum] = "0d3bdacd012c94bb910a2d120bfee5579c8ce39e4df1d51a407e864aa30452a1"

GEM_NAME = "aws-sdk-guardduty"

inherit rubygems
