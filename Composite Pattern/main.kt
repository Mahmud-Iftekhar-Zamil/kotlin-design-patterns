package composite

fun main(args: Array<String>) {
    var subTeam1 = Team()
    subTeam1.add(Truck())
    subTeam1.add(HumanResource())
    subTeam1.add(HumanResource())

    var subTeam2 = Team()
    subTeam2.add(Truck())
    subTeam2.add(HumanResource())
    subTeam2.add(HumanResource())

    var onlyTruck = Truck()

    var team = Team()
    team.add(subTeam1)
    team.add(subTeam2)
    team.add(onlyTruck)

    team.deploy()

}